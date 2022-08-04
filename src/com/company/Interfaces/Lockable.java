package com.company.Interfaces;

import com.company.MainBank.MainSafe;

public interface Lockable {
    boolean lock(MainSafe safe);
}
