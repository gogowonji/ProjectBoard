package com.projectboard.repository;

import com.projectboard.domain.Member;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(int MemberNo);
}
