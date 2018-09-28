package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] s = new char[n][81];
	  for (i = 0;i < n;i++)
	  {
		s[i] = new Scanner(System.in).nextLine();
	  }
	  for (i = 0;i < n;i++)
	  {
		int a = 1;
		p = s[i];
		if (*p >= 65 && *p <= 90 || *p == 95 || *p >= 95 && *p <= 122)
		{
		  p++;
		  while (*p != 0)
		  {
			if (*p < 48 || *p>57 && *p < 65 || *p>90 && *p != 95 && *p < 95 || *p>122)
			{
			  a = 0;
			  break;
			}
			p++;
		  }
		}
		else
		{
		  a = 0;
		}
		System.out.printf("%d\n",a);
	  }

	}


}

