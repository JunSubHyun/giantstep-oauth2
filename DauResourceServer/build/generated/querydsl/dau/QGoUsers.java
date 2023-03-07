package dau;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGoUsers is a Querydsl query type for GoUsers
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGoUsers extends EntityPathBase<GoUsers> {

    private static final long serialVersionUID = -1794214518L;

    public static final QGoUsers goUsers = new QGoUsers("goUsers");

    public final StringPath employeeNumber = createString("employeeNumber");

    public final StringPath loginId = createString("loginId");

    public final StringPath name = createString("name");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QGoUsers(String variable) {
        super(GoUsers.class, forVariable(variable));
    }

    public QGoUsers(Path<? extends GoUsers> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGoUsers(PathMetadata metadata) {
        super(GoUsers.class, metadata);
    }

}

