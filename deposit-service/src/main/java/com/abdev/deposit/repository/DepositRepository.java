package com.abdev.deposit.repository;

import com.abdev.deposit.entity.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepository extends CrudRepository<Deposit, Long> {
}
