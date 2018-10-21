package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] c = new int['z'];
		  int flag = 0;
		  int n;
		  int i;
		  int count;
		  int j;
		  String str = new String(new char[100001]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  for (count = 0;count < n;count++)
		  {

		  for (j = 'a';j <= 'z';j++)
		  {
			  c[j] = 0;
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  str = tempVar2.charAt(0);
		  }
		  i = 0;
		  while (str.charAt(i) != '\0')
		  {
					 c[str.charAt(i)]++;
					 i++;
		  }
		  i = 0;
		  flag = 0;
		  while (str.charAt(i) != '\0')
		  {
					 if (c[str.charAt(i)] == 1)
					 {
						 System.out.printf("%c\n",str.charAt(i));
						 flag = 1;
						 break;
					 }
					 i++;
		  }
		  if (flag != 1)
		  {
			  System.out.print("no\n");
		  }
		  }
	}

}

