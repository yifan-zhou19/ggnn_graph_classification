package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int a;
	  int b;
	  int c;
	  int i;
	  int s = 1;
	  int t = 0;
	  char[][] w =
	  {
		  {'S', 'u', 'n', '.', '\0', '\0'},
		  {'M', 'o', 'n', '.', '\0', '\0'},
		  {'T', 'u', 'e', '.', '\0', '\0'},
		  {'W', 'e', 'd', '.', '\0', '\0'},
		  {'T', 'h', 'u', '.', '\0', '\0'},
		  {'F', 'r', 'i', '.', '\0', '\0'},
		  {'S', 'a', 't', '.', '\0', '\0'}
	  };
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  c = Integer.parseInt(tempVar3);
	  }
	  for (i = 1;i <= 400;i++)
	  {
		t += 365;
		if (i % 400 && i % 100 == 0 || i % 4)
		{
			;
		}
		else
		{
			t++;
		}
		t %= 7;
	  }
	  s += ((a - 1) / 400 * t);
	  for (i = 1;i <= (a - 1) % 400; i++)
	  {
		s += 365;
		if (i % 400 && i % 100 == 0 || i % 4)
		{
			;
		}
		else
		{
			s++;
		}
		s %= 7;
	  }
	  if (a % 400 && a % 100 == 0 || a % 4)
	  {
		  ;
	  }
	  else
	  {
		  d[2]++;
	  }
	  for (i = 1;i < b; i++)
	  {
		 s += d[i];
	  }
	  s += c;
	  s--;
	  s %= 7;
	  System.out.printf("%s\n",w[s]);
	  return 0;
	}

}

