package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // 「@Entity」アノテーションを付けて、「JPA」の「エンティティ」であることを示す。
@Table(name = "customers") // 「@Table」アノテーションを付けて、「エンティティ」に対応するテーブル名を指定。デフォルトでは「テーブル名＝クラス名」になる。この例では、「テーブル名」は「クラス名」から変えている。
@Data
@NoArgsConstructor // 「JPA」の仕様で、「エンティティ・クラス」には引数のない「デフォルト・コンストラクタ」を作る必要がある。「Lombok」で「デフォルト・コンストラクタ」を生成するために「@NoArgsConstructor」アノテーションを付ける。
@AllArgsConstructor // 「JPA」とは関係ないが、プログラミングの際に便利であるため、「デフォルト・コンストラクタ」以外に、全フィールドを引数にもつコンストラクタも「Lombok」で生成させる。「＠AllArgsConstructor」アノテーションを付けることで生成可能。
public class Customer {
    @Id // 「エンティティ」の「主キー」であるフィールドに、「@Id」アノテーションを付ける。
    @GeneratedValue // 「主キー」が「DB」で自動採番されることを、「@GeneratedValue」アノテーションを付けて示す。
    private Integer id;
    @Column(nullable = false) // 「フィールド」に「@Column」アノテーションを付けて、該当するDBのカラムに対する「名前」や「制約」などを設定する。ここでは「not null」制約を設定。
    private String firstName;
    @Column(nullable = false)
    private String lastName;
}
