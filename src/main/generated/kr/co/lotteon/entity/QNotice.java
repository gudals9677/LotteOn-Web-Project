package kr.co.lotteon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNotice is a Querydsl query type for Notice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotice extends EntityPathBase<Notice> {

    private static final long serialVersionUID = -1847281221L;

    public static final QNotice notice = new QNotice("notice");

    public final StringPath noticeCate = createString("noticeCate");

    public final StringPath noticeContent = createString("noticeContent");

    public final DateTimePath<java.time.LocalDateTime> noticeDate = createDateTime("noticeDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> noticeHit = createNumber("noticeHit", Integer.class);

    public final NumberPath<Integer> noticeNo = createNumber("noticeNo", Integer.class);

    public final StringPath noticeTitle = createString("noticeTitle");

    public final StringPath noticeType = createString("noticeType");

    public QNotice(String variable) {
        super(Notice.class, forVariable(variable));
    }

    public QNotice(Path<? extends Notice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotice(PathMetadata metadata) {
        super(Notice.class, metadata);
    }

}

