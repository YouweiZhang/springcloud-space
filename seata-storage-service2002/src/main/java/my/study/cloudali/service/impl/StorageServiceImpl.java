package my.study.cloudali.service.impl;

import lombok.extern.slf4j.Slf4j;
import my.study.cloudali.dao.StorageDao;
import my.study.cloudali.service.IStorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements IStorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
