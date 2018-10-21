package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int num = 0;
		  int i;
		  String str = new String(new char[1000]);
		  char b;
		  char a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  for (i = 0;i < str.length();i++)
		  {
			  for (b = 'A';b <= 'Z';b++)
			  {
			  if (str.charAt(i) == b || str.charAt(i) == b + 32)
			  {
				 num = num + 1;
				 break;
			  }
			  }
			  if (str.charAt(i + 1) != b && str.charAt(i + 1) != b + 32)
			  {
				System.out.printf("(%c,%d)",b,num);
				num = 0;
			  }
		  }

		return (0);

	}

}

