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
public class FIND_THE_NUMBER_OCCURRING_ODD_NUMBER_OF_TIMES_1{
static int f_gold ( ArrayList<Integer> arr , int n ) {
  HashMap < Integer , Integer > hmap = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( hmap . containsKey ( arr .get(i) ) ) {
      int val = hmap . get ( arr .get(i) ) ;
      hmap . put ( arr .get(i) , val + 1 ) ;
    }
    else hmap . put ( arr .get(i) , 1 ) ;
  }
  for ( Integer a : hmap . keySet ( ) ) {
    if ( hmap . get ( a ) % 2 != 0 ) return a ;
  }
  return - 1 ;
}
}