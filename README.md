# ClickOverlapPrevent

- project for jw <br />
- email address :  cjd9408abcd@gmail.com <br />

## Introduction
- This is a simple source code that prevents double clicks.

```java
        btn_test.setOnClickListener(v -> {

            if (firstClick){
                firstClick = false;
                Log.d(TAG , "구현부 안 firstClick ? : " + firstClick);
                //TODO:
                Log.d(TAG , "3초대기");

                new Handler().postDelayed(() -> {

                    firstClick = true;
                    Log.d(TAG , "Handler 안 firstClick ? : " + firstClick);

                }, 3000);

            }

        });
```
