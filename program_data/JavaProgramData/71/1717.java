package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
	  int N; //??????n,m1,m2?????
	  int n;
	  int m1;
	  int m2;
	  int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
										  //????a?????12????
	  N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (;N > 0;N--) //????????
	  {
		  a[1] = 28; //?2?????28
		  int d = 0; //??d????????
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) //???????
		  {
		  a[1] += 1; //??2??????
		  }
		  if (m1 > m2) //??m1>m2??????
		  {
			  m1 = m1 ^ m2;
			  m2 = m1 ^ m2;
			  m1 = m1 ^ m2;
		  }
		  for (;m1 < m2;m1++) //?????????????
		  {
		  d += a[m1 - 1]; //?????7?????????
		  }
		  if (d % 7 == 0)
		  {
			  System.out.print("YES");
		  }
		  else
		  {
			  System.out.print("NO");
		  }
		  System.out.print("\n");
	  }
	  return 0;
	}

}

