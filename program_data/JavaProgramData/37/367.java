package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String str = new String(new char[100010]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char ans;
		int[] c = new int[26];
		//freopen("input.txt","r",stdin);
		//freopen("output.txt","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(c,0,(Integer.SIZE / Byte.SIZE));
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  str = tempVar2.charAt(0);
			  }
			  ans = '@';
			  for (p = str; * p; p++)
			  {
				  c[*p - 'a']++;
			  }
			  for (p = str; * p; p++)
			  {
				  if (c[*p - 'a'] == 1)
				  {
				   ans = p;
				   break;
				  }
			  }
			  if (ans == '@')
			  {
				  System.out.print("no\n");
			  }
			  else
			  {
				  System.out.printf("%c\n", ans);
			  }
		}
		return 0;
	}

}

