import Data.Char
import Data.Char as Ch
import qualified Data.Char as Ch
import Foreign.C.Types
foreign import ccall "plus" c_plus :: CInt -> IO CInt
main1() {
  data_list = [100, 200, 300, 400]
  total = 0
  for (i = 0; i < length(data_list); i++) {
      total = total + data_list[i]
  }
  total = total * 1.1
  print(total)
}
data_list = [100, 200, 300, 400]
main2() = print(total)
total = calc_total(data_list)
calc_total(x) = sum(x) * 1.1
main3 = print "Hello"
main4 = putStrLn "Hello world!"
main5 = do { putStrLn "Red"; putStrLn "Green"; putStrLn "Blue" }
main6 = do putStrLn "Red"
          putStrLn "Green"
          putStrLn "Blue"
main7 = do
  putStrLn "Red"
  putStrLn "Green"
  putStrLn "Blue"
putChar 'a'
putStr "ABC"
putStrLn "ABC"
print "ABC"
x <- getChar
x <- getLine
x <- getContents
x <- readLn
x = 123
main8 = print x
x :: Int
y :: Int
x = 123
y = 234
main9 = print $ x + y
x = 123 :: Int
y = 234 :: Int
main10 = print $ x + y
s1 = [x * x | x <- [1..5]]
s2 = [x * x | x <- [1..5], x /= 3]
(1, 2, 3)
(1, 'a', "ABC")
func = return ()
fst (1, 'a', "ABC")
snd (1, 'a', "ABC")
(_, _, x) =  (1, 'a', "ABC")
x = y + z
x = (+) y z
x = y `add` z
add x y = x + y
main11 = print (add 3 5)
main12 = print $ add 3 5
add :: Int -> Int -> Int
x ^^^ y = x * 1000 +  y
main13 = print $ 2 ^^^ 20
x +++ y = x + y
x *** y = x * y
infixl 7 +++
infixl 6 ***
main14 = print $ 10 *** 3 +++ 2
fact 0 = 1
fact n = n * fact (n - 1)
main15 = print $ fact 5
main16 = do
  print c
    where
      c = a + b
      a = (\x -> x * x) 5
      b = (\(x, y) -> x * y) (2, 3)
func 1 = "One"
func 2 = "Two"
func 3 = "Three"
main17 = print $ func 1
fact 0 = 1
fact n = n * fact (n - 1)
main18 = print $ fact 5
foo x
  | x == 1 = "One"
  | x == 2 = "Two"
  | x == 3 = "Three"
  | otherwise = "More..."
main19 = putStrLn $ foo 2
foo x | x >= 5 = x - 5
main20 = do
  print $ foo 5
  print $ foo 4
f n = n * 2
g n = n * 3
h n = n * 4
fn n = f(g(h(n)))
main21 = print $ fn 5
fn n = f(g(h(n)))
fn n = (f . g . h) n
fn = (f . g . h)
func str@(x:xs) = do
  print str
  print x
  print xs
main22 = do
  func "ABCDE"
main23 = do { print "A"; print "B"; print "C" }
main24 = do
  print "A"
  print "B"
  print "C"
main25 = do
  let msg = "Hello"
  putStrLn msg
area_of_circle r =
  let
    pi = 3.14
  in do
    r * r * pi
main26 = print $ area_of_circle 1.23
isZero x =
  if x == 0 then
    "Zero"
  else
    "NotZero"
main27 = putStrLn $ isZero 123
getColor x =
  case x of
    1 -> "Red"
    2 -> "Green"
    3 -> "Blue"
    _ -> "Unknown"
main28 = putStrLn $ getColor 3
main29 = print $ add x y
  where
    x = 123
    y = 456
    add x y = x + y
main30 = do { print $ ord 'A'; print $ chr 65 }
main31 = do { print $ Ch.ord 'A'; print $ Ch.chr 65 }
loop 0 action = return ()
loop n action = do { action; loop (n - 1) action }
main32 = loop 10 $ putStrLn "Hello"
import Control.Monad
main33 = do
  replicateM_ 3 $ putStrLn "Hello"
data Color1 = Red | Green | Blue
data Color2 = Red | Green | Blue deriving Show
main34 = do
  let c = Red
  print c
data Color3 = Red | Green | Blue deriving (Show, Eq)
main35 = do
  let x = Red
  let y = Green
  if x == y then print "Equal" else print "Not Equal"
data Point1 = Point Int Int deriving Show
addPoint (Point1 x1 y1) (Point1 x2 y2) = Point1 (x1 + x2) (y1 + y2)
main36 = do
  let a = Point1 100 200
      b = Point1 300 400
      c = addPoint a b
  print c
data Point2 = Point { x, y :: Int } deriving Show
main37 = do
  let a = Point2 { x = 100, y = 200 }
  print a
data Point3 a = Point a a deriving Show
main38 = do
  print $ Point3 100 200
  print $ Point3 100.0 200.0
data Figure = Rect { x1, y1, x2, y2 :: Int }
            | Circle { x, y, r :: Int }
            deriving Show
main39 = do
  let a = Rect { x1 = 100, y1 = 100, x2 = 200, y2 = 200 }
      b = Circle { x = 100, y = 100, r = 100 }
  print a
  print b
area :: Figure -> Double
area (Rect x1 y1 x2 y2) = fromIntegral ((x2 - x1) * (y2 - y1))
area (Circle x y r) = (fromIntegral(r) * fromIntegral(r) * 3.14)
main40 = do
  let a = Rect { x1 = 100, y1 = 100, x2 = 200, y2 = 200 }
      b = Circle { x = 100, y = 100, r = 50 }
  print $ area a
  print $ area b
newtype Pixel = Pixel Int deriving Show
main41 = do
  let a = Pixel 300
  print a
type Person = (Name, Address)
type Name = String
type Address = None | Addr String
class Foo a where
    foo :: a -> String
instance Foo Bool where
    foo True = "Bool: True"
    foo False = "Bool: False"
instance Foo Int where
    foo x = "Int: " ++ show x
instance Foo Char where
    foo x = "Char: " ++ [x]
main42 = do
    putStrLn $ foo True	
    putStrLn $ foo (123::Int)
    putStrLn $ foo 'A'
{-# LANGUAGE FlexibleInstances #-}
class Foo a where
    foo :: a -> String
instance Foo String where
    foo x = "String: " ++ x
main43 = do
    putStrLn $ foo "ABC"
fn :: Int -> Maybe String
fn n
    | n == 1 = Just "One"
    | n == 2 = Just "Two"
    | otherwise = Nothing
main44 = do
    print $ fn 1
    print $ fn 2
    print $ fn 3
fn n = n * 2
main45 = do
    print $ fmap fn [1, 2, 3]
    print $ fmap fn Nothing
    print $ fmap fn (Just 5)
    print $ fmap fn (2, 3)
fn n = n * 2
main46 = do
    print $ fn <$> [1, 2, 3]
    print $ fn <$> Nothing
    print $ fn <$> (Just 5)
    print $ fn <$> (2, 3)
main47 = do
    print $ pure (*2) <*> Just 5
    print $ pure (*2) <*> [1, 2, 3]
main48 = do
    print $ [(*2), (*3)] <*> [1, 2, 3]
class Applicative m => Monad (m :: * -> *) where
  (>>=) :: m a -> (a -> m b) -> m b
  return :: a -> m a
fn x = return (2 * x)
main49 = do
    print $ [1, 2, 3] >>= fn
    print $ Just 5 >>= fn
    print $ Nothing >>= fn
fn x = x * 2
ans = map fn [1, 2, 3]
main50 = print ans
tax :: Double -> Double -> Double
tax rate price = rate * price
main51 = do
  print $ tax 0.1 2500
  print $ tax 0.1 3500
tax :: Double -> Double -> Double
tax rate price = rate * price
jptax = tax 0.1
main52 = do
  print $ jptax 2500
  print $ jptax 3500
exp2a = (^2)
exp2b = (2^)
main53 = do
  print $ exp2a 5
  print $ exp2b 5
function add1(x, y, z) {
  return x + y + z;
}
function add2(x) {
  return function(y, z) { return x + y + z; }
}
function add3(x) {
  return function(y) { return function(z) { return x + y + z; } }
}
console.log(add1(1, 2, 3));
console.log(add2(1)(2, 3));
console.log(add3(1)(2)(3));
add x y z = x + y + z
main54 = do
  print $ (add 1 2 3)
  print $ (add 1) 2 3
add1 :: Int -> Int -> Int -> Int
add1 x y z = x + y + z
add2 :: Int -> Int -> Int -> Int
add2 = \x -> \y -> \z -> x + y + z
add (x, y) = x + y
main55 = print $ add (3, 5)
fn x y z = do { print x; print y }
main56 = fn (1+2) (3+4) (5+6)
main57 = print $ take 5 [1..]
int plus(int a)
{
    return a + 1;
}
plus :: Int -> IO Int
plus = fmap fromIntegral . c_plus . fromIntegral
main58 :: IO ()
main58 = do
  print =<< plus 5
