package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int b;
	  int d = 0;
	  int[] s = new int[15];
	  int i;
	  int j;
	  while (true)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s[0] = Integer.parseInt(tempVar);
	  }
	  if (s[0] == -1)
	  {
		  break;
	  }
	  for (i = 1;s[i - 1] != 0;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = 0;s[i] != 0;i++)
	  {
	  for (j = 0;s[j] != 0;j++)
	  {
		  if (s[i] == s[j] * 2)
		  {
		  d++;
		  }
		  else
		  {
			  d = d;
		  }
	  }
	  }
	  System.out.printf("%d\n",d);
	   d = 0;
	  }
	}

}

