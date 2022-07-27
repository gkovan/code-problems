package com.example.demos.July2022practice.MultiValueEnum;

import java.util.Arrays;
import java.util.Optional;

public enum AccountStatus {
    PURGED("P", "purged", -1),
    INACTIVE("I", "inactive", 0),
    ACTIVE("A", "active", 1);

    private final String shortName;
    private final String fullName;
    private final int code;

    AccountStatus(String shortName, String fullName, int code) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCode() {
        return code;
    }

    // Reverse lookup methods
    public static Optional<AccountStatus> getAccountStatusByValue(String value) {
        return Arrays.stream(AccountStatus.values())
                .filter(accStatus -> accStatus.shortName.equals(value)
                        || accStatus.fullName.equals(value))
                .findFirst();
    }

    public static Optional<AccountStatus> getAccountStatusByValue(int value) {
        return Arrays.stream(AccountStatus.values())
                .filter(accStatus -> accStatus.code == value)
                .findFirst();
    }

    public static void main(String[] args) {
        System.out.println(AccountStatus.values());
        Optional<AccountStatus> accountStatus = Arrays.stream(AccountStatus.values())
                .filter(accStatus -> accStatus.code == 0).findFirst();
        System.out.println(accountStatus.get().getFullName());

        // Print all enum and values

        for (AccountStatus as : AccountStatus.values()) {
            System.out.println("Status " + as.getCode() + " is : " + as.getFullName());
        }

        // Reverse Lookup Examples

        Optional<AccountStatus> statusEnum = AccountStatus.getAccountStatusByValue(0);

        if (statusEnum.isPresent()) {
            System.out.println("Account Status Full Name: " + statusEnum.get().getFullName());
            System.out.println("Account Status Short name: " + statusEnum.get().getShortName());
        }

        Optional<AccountStatus> activeStatusEnum = AccountStatus.getAccountStatusByValue("A");

        if (statusEnum.isPresent()) {
            System.out.println("Account Status Full Name : " + activeStatusEnum.get().getFullName());
            System.out.println("Account Status Code : " + activeStatusEnum.get().getCode());
        }

        if ( 1 == 1) { int x = 5; int y = 10; int z = x + y;}
    }
}