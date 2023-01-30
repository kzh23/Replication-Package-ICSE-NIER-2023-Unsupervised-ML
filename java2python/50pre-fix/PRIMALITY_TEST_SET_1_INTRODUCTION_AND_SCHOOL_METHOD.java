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
public class PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD{
static boolean f_gold ( int n ) {
  if ( n <= 1 ) return false ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) if ( n % i == 0 ) return false ;
  return true ;
}
}