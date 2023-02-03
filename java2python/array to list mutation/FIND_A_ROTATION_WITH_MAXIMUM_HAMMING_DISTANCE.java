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
public class FIND_A_ROTATION_WITH_MAXIMUM_HAMMING_DISTANCE{
static int f_gold ( ArrayList<Integer> arr , int n ) {
  int brr [ ] = new int [ 2 * n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) brr [ i ] = arr .get(i) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) brr [ n + i ] = arr .get(i) ;
  int maxHam = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int currHam = 0 ;
    int j = i;
    int k = 0;
    while(j < i + n){
      if ( brr [ j ] != arr .get(k) ) currHam ++ ;
      j++;
      k++;
    }
    if ( currHam == n ) return n ;
    maxHam = Math . max ( maxHam , currHam ) ;
  }
  return maxHam ;
}
}