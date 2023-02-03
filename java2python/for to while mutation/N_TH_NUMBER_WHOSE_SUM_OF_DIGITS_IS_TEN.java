// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN{
public static int f_gold ( int n ) {
  int count = 0 ;
  for ( int curr = 1 ;
  ;
  curr ++ ) {
    int sum = 0 ;
    int x = curr;
    while(x > 0){
      sum = sum + x % 10 ;
      x = x / 10;
    }
    if ( sum == 10 ) count ++ ;
    if ( count == n ) return curr ;
  }

}
}