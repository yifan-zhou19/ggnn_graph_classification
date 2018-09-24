package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String temp = new String(new char[1000]);
		int[] b = new int[1000];
		int i;
		int n = 0;
		int m = 0;
		int len;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(temp,2,(Character.SIZE / Byte.SIZE));
		while (true)
		{
			m = 0;
			n = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  if (strcmp(temp,s) == 0)
		  {
			  break;
		  }
		  else
		  {
			  temp = s;
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(b,0,(Integer.SIZE / Byte.SIZE));
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == '(')
			{
			n++;
			}
			else if (s.charAt(i) == ')' && n > 0)
			{
				n--;
				b[i] = 1;
			}
		}
		for (j = len - 1;j >= 0;j--)
		{
			if (s.charAt(j) == ')')
			{
				m++;
			}
			else if (s.charAt(j) == '(' && m > 0)
			{
				m--;
				b[j] = 1;
			}
		}
		System.out.printf("%s\n",s);
		for (i = 0;i < len;i++)
		{
			if (b[i] == 0 && s.charAt(i) == ')')
			{
				System.out.print("?");
			}
			else if (b[i] == 0 && s.charAt(i) == '(')
			{
				System.out.print("$");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		}
		return 0;
	}

}

