import Data.Char
import Data.Char as Ch
import qualified Data.Char as Ch
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
