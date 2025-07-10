# 🎯 Branch Convention & Git Convention
## 🎯 Git Convention
- 🎉 Start : 프로젝트 시작
- ✨ Feat : 새로운 기능 추가
- 🐛 Fix : 버그 수정
- 🔥 Remove : 코드나 파일 삭제
- ♻️ Refactor : 코드 리팩토링
- 🎨 Design : UI/스타일 구조 개선
- 💄 Style : 코드 포맷/스타일 수정 (기능 변화 없음)
- 📝 Docs : 문서 추가 또는 수정
- 🚀 Deploy : 배포 작업
- 🔧 Settings : 설정 파일 추가/수정
- ➕ Dependency : 의존성 추가
- ➖ Remove Dependency : 의존성 제거
- 🔀 Merge : 브랜치 병합
- ⏪️ Revert : 커밋 롤백
- ✅ Test : 테스트 코드 추가/수정/통과
- 🚑️ Hotfix : 긴급 수정
- 💚 Fix CI : CI 빌드 수정
- 👷 CI : CI 설정 추가/수정
- 🚨 Fix Warnings : 컴파일러/린터 경고 수정
- 🚧 WIP : 작업 진행 중 (Work In Progress)
- 🔒️ Security : 보안 이슈 수정
- 🔐 Secrets : 비밀키 추가/수정
- 📈 Analytics : 분석/트래킹 코드 추가
- ✏️ Typo : 오타 수정
- 💡 Comments : 코드 주석 추가/수정
- 🚚 Rename/Move : 파일 이동 또는 이름 변경
- 🏗️ Architecture : 아키텍처 변경
- 🥚 Easter Egg : 이스터에그 추가/수정
- 🙈 Gitignore : .gitignore 파일 추가/수정
- 🗑️ Deprecate : 폐기 예정 코드 추가
- 🛂 Authorization : 인증/권한 관련 작업
- 🩹 Simple Fix : 단순한 사소한 수정
- ⚰️ Dead Code : 사용하지 않는 코드 제거
- 🧵 Multithreading : 멀티스레딩/병렬처리 코드 추가/수정

## 🪴 Branch Convention (GitHub Flow)
- `main`: 배포 가능한 브랜치, 항상 배포 가능한 상태를 유지
- `feature/{description}`: 새로운 기능을 개발하는 브랜치
    - 예: `feature/add-login-page`
### Flow
1. `main` 브랜치에서 새로운 브랜치를 생성.
2. 작업을 완료하고 커밋 메시지에 맞게 커밋.
3. Pull Request를 생성 / 팀원들의 리뷰.
4. 리뷰가 완료되면 `main` 브랜치로 병합.
5. 병합 후, 필요시 배포.
   **예시**:
```bash
# 새로운 기능 개발
git checkout -b feature/add-login-page
# 작업 완료 후, main 브랜치로 병합
git checkout main
git pull origin main
git merge feature/add-login-page
git push origin main
```