package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] b = new int[200];
	  int i;
	  int j;
	  String a = new String(new char[200]);
	  while (gets(a))
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		//if(a=EOF) break;
		for (i = 0;i < 200;i++)
		{
		  if (a.charAt(i) == '\0')
		  {
			  break;
		  }
		  if (a.charAt(i) == '(')
		  {
			  b[i] = 1;
		  }
		  if (a.charAt(i) == ')')
		  {
			b[i] = 1;
			for (j = i;j >= 0;j--)
			{
			  if (a.charAt(j) == '(' && b[j] == 1)
			  {
				b[i] = 0;
				b[j] = 0;
				break;
			  }
			}
		  }
		}
		System.out.printf("%s\n",a);
		for (i = 0;i < 200;i++)
		{
		if (a.charAt(i) == '\0')
		{
			break;
		}
		if (a.charAt(i) == '(' && b[i] == 1)
		{
			System.out.print("$");
		}
		else
		{
		if (a.charAt(i) == ')' && b[i] == 1)
		{
			System.out.print("?");
		}
		else
		{
			System.out.print(" ");
		}
		}

		}
		System.out.print("\n");
		//gets(a);
	  }
	  return 0;
	}








}
