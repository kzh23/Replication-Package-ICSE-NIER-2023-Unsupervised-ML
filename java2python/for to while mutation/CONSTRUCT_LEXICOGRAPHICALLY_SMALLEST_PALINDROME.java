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
public class CONSTRUCT_LEXICOGRAPHICALLY_SMALLEST_PALINDROME{
static String f_gold ( ArrayList<Character> str, int len ) {
  int i = 0;
  int j = len - 1;
  while(i < j){
    if ( str .get(i) == str .get(j) && str .get(i) != '*' ) continue ;
    else if ( str .get(i) == str .get(j) && str .get(i) == '*' ) {
      str .set(i, 'a') ;
      str .set(j, 'a') ;
      i++;
      j--;
      continue ;
    }
    else if ( str .get(i) == '*' ) {
      str .set(i, str .get(j) );
      i++;
      j--;
      continue ;
    }
    else if ( str .get(j) == '*' ) {
      str .set(j , str .get(i));
      i++;
      j--;
      continue ;
    }
    System . out . println ( "Not Possible" ) ;
    return "" ;

  }
  return String . valueOf ( str ) ;
}

}