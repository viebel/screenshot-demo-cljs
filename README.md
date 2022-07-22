# Screenshot demo


# Run locally

On one terminal, let shadow watch the build with:

```
shadow-cljs watch app
```

On another terminal, run the app with `node`:

```
node out/app/script.js
```

Connect your CLJS REPL client to the nrepl port `shadow-cljs` listens to. For instance, in Conjure you run:

```
:ConjureShadowSelect app
```

Now, you can evaluate CLJS code in the REPL. 
