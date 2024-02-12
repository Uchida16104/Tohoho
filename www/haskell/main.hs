main() {
  data_list = [100, 200, 300, 400]		-- 計算したいデータはこれ
  total = 0					-- まず total に 0 を代入しておく
  for (i = 0; i < length(data_list); i++) {	-- iの値を0から1ずつ増やしながら...
      total = total + data_list[i]		-- 総和を計算していく
  }
  total = total * 1.1				-- 総和に税金(10%)をかける
  print(total)					-- 結果を表示する
}
