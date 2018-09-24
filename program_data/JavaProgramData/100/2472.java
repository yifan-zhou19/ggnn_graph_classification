package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  int flag = 0;
	  String a = new String(new char[500]);
	  int[] b = new int[52];
	  for (i = 0;i <= 51;i++)
	  {
		  b[i] = 0;
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  for (i = 0;i <= a.length() - 1;i++)
	  {
		  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		  {
			 b[a.charAt(i) - 'a' + 26]++;
			 if (flag == 0)
			 {
				flag = 1;
			 }
		  }
		  if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		  {
			 b[a.charAt(i) - 'A']++;
			 if (flag == 0)
			 {
			 flag = 1;
			 }
		  }
	  }
	  if (flag != 0)
	  {
	  for (i = 0;i <= 25;i++)
	  {
		  if (b[i] != 0)
		  {
			 System.out.printf("%c=%d\n",i + 'A',b[i]);
		  }
	  }
	  for (i = 26;i <= 51;i++)
	  {
		  if (b[i] != 0)
		  {
		   System.out.printf("%c=%d\n",i + 'a' - 26,b[i]);
		  }
	  }
	  }
	  else
	  {
	  System.out.print("No");
	  }

	}

}

