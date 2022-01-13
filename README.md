# 사원관리 프로그램 API 테스트

## 기능

- application.yaml 파일로 파라미터 수정
- 콘솔창에 api 이름 입력하면 request, response 확인

## application.yaml

```yaml
server:
  port: 8081

signup:
  method: POST
  url: /api/auth/signup
  param:
    loginId: orijoon98
    password: AAbb12!!
    name: joon
    email: orijoon98@gmail.com

login:
  method: POST
  url: /api/auth/login
  param:
    loginId: orijoon98
    password: AAbb12!!

verify:
  method: POST
  url: /api/auth/verify

getVerify:
  method: GET
  url: /api/auth/verify/

delete:
  method: DELETE
  url: /api/auth/delete
  param:
    loginId: user

updateUserPublic:
  method: PUT
  url: /api/user/public
  param:
    country: Korea
    birthday: 1998-02-05
    gender: male
    zipCode: 04588
    address: 23, Cheonggu-ro 1-gil, Jung-gu, Seoul, Republic of Korea
    detailAddress: 101-1
    number: 02-1234-5678
    phoneNumber: 010-1234-5678

updateUserPrivate:
  method: PUT
  url: /api/user/private
  param:
    bank: shinhan
    accountNumber: 454111-05-519143
    accountHolder: user
    note:
```

## 예시

- 회원가입 테스트
    
![스크린샷 2022-01-13 오전 11 11 17](https://user-images.githubusercontent.com/74812188/149253637-94be3b34-7b24-4e9a-b702-d855f2cec6b4.png)

- 로그인 테스트

![스크린샷 2022-01-13 오전 11 12 10](https://user-images.githubusercontent.com/74812188/149253643-f19c7298-4ece-4b1c-9e59-d743b45a21ad.png)    
