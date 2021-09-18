# memorandum-app-api
### タスクフロー
 - タスクを着手する前にissueを作成する。
 - タスクを実施するときはprojectのstatusをin progressに変更する
 - タスク完了時にレビュー依頼を出す（ソースコードの修正であれば下記命名規則に従ってブランチを切る）
 - レビュー後、必要な場合は修正を行った後、問題なくればprojectのstatusをrequest to testに変更する
 - 単体テストを行い、issueのコメントに単体テスト項目とエビデンスを記載する
 - 単体テストで動作問題なければissueをcloseする
 - issueをcloseした後、mainブランチに対してpull requestを作成する
 - pull requestを作成したらマージ依頼を出す
 
 #### ブランチ命名規則
 #{ issue No }_{ memorandum_app_api }_{ 任意の修正に関する名前(英語) }
