package my.study.cloudali.service;

public interface IStorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
