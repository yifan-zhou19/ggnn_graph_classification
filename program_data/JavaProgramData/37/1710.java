package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100001]);
		  int n;
		  int i;
		  int x;
		  int y;
		  int[] b = new int[100001];
		  int key = 100002;
		  int count;
		  int t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (t = 1;t <= n;t++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }

		  count = a.length();
			  for (x = 0;x < count;x++)
			  {
				  for (y = 0;y < count;y++)
				  {
					  if (a.charAt(y) == a.charAt(x))
					  {
					  b[x]++;
					  }
				  }

			  }
			  for (i = 0;i < count;i++)
			  {
			  if (b[i] == 1)
			  {
			  key = i;
			  break;
			  }
			  }
			  if (key == 100002)
			  {
			  System.out.print("no\n");
			  }
			  else
			  {
			  System.out.printf("%c\n",a.charAt(key));
			  }

			  key = 100002;
			  for (i = 0;i < 100001;i++)
			  {
			  b[i] = 0;
			  }
		  }
	}
}

