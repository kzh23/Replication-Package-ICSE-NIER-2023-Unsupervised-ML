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
public class FIND_MAXIMUM_SUM_POSSIBLE_EQUAL_SUM_THREE_STACKS{
public static int f_gold ( int stack1 [ ] , int stack2 [ ] , int stack3 [ ] , int n1 , int n2 , int n3 ) {
  int sum1 = 0 , sum2 = 0 , sum3 = 0 ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) sum1 += stack1 [ i ] ;
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) sum2 += stack2 [ i ] ;
  for ( int i = 0 ;
  i < n3 ;
  i ++ ) sum3 += stack3 [ i ] ;
  int top1 = 0 , top2 = 0 , top3 = 0 ;
  int ans = 0 ;
  while ( true ) {
    if ( top1 == n1 || top2 == n2 || top3 == n3 ) return 0 ;
    if ( sum1 == sum2 && sum2 == sum3 ) return sum1 ;
    if ( sum1 >= sum2 && sum1 >= sum3 ) sum1 -= stack1 [ top1 ++ ] ;
    else if ( sum2 >= sum3 && sum2 >= sum3 ) sum2 -= stack2 [ top2 ++ ] ;
    else if ( sum3 >= sum2 && sum3 >= sum1 ) sum3 -= stack3 [ top3 ++ ] ;
  }
}
}