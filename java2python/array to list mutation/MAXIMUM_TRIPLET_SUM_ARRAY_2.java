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
public class MAXIMUM_TRIPLET_SUM_ARRAY_2{
static int f_gold ( ArrayList<Integer> arr , int n ) {
  int maxA = - 100000000 , maxB = - 100000000 ;
  int maxC = - 100000000 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr .get(i) > maxA ) {
      maxC = maxB ;
      maxB = maxA ;
      maxA = arr .get(i) ;
    }
    else if ( arr .get(i) > maxB ) {
      maxC = maxB ;
      maxB = arr .get(i) ;
    }
    else if ( arr .get(i) > maxC ) maxC = arr .get(i) ;
  }
  return ( maxA + maxB + maxC ) ;
}
}