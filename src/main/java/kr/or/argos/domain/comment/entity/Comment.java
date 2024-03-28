package kr.or.argos.domain.comment.entity;

import jakarta.persistence.*;
import kr.or.argos.domain.common.BaseEntity;
import kr.or.argos.domain.post.entity.Post;
import kr.or.argos.domain.user.entity.User;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

    @Id
    @Column(name = "id", nullable = false, unique = true, insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    @Column(name = "is_secret", nullable = false)
    private boolean isSecret;

    @Column(name = "password", length = 80)
    private String password;

    @Column(columnDefinition = "TEXT", name = "content", nullable = false)
    private String content;

    @Column(name = "status", length = 10)
    private String status;  // Need to be replaced to ENUM.
}

