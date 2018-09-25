package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum = 0;
		int i;
		int t;
		char[] str = {0, '\0', '\0', '\0', '\0'};
		char[] str2 = {0, '\0', '\0', '\0', '\0'};
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
	  for (i = 0;str[i] != '\0';i++)
	  {
		  sum = sum + 1;
	  }
	  for (i = sum - 1;i >= 0;i--)
	  {
		  t = sum - i - 1;
		  str2[t] = str[i];
	  }
	  System.out.printf("%s",str2);

	}
}

