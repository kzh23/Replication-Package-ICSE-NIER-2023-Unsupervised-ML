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
public class COUNT_SET_BITS_IN_AN_INTEGER_1{
public static int f_gold ( int n ) {
  if ( n == 0 ) return 0 ;
  else return ( n & 1 ) + f_gold ( n >> 1 ) ;
}

}