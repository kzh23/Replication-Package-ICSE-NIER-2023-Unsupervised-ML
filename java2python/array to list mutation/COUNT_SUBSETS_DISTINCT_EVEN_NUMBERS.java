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
public class COUNT_SUBSETS_DISTINCT_EVEN_NUMBERS{
static int f_gold ( ArrayList<Integer> arr , int n ) {
  HashSet < Integer > us = new HashSet < > ( ) ;
  int even_count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( arr .get(i) % 2 == 0 ) us . add ( arr .get(i) ) ;
  even_count = us . size ( ) ;
  return ( int ) ( Math . pow ( 2 , even_count ) - 1 ) ;
}

}