package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String p = new String(new char[260]);
		  String q = new String(new char[260]);
		  int[] a = new int[251];
		  int[] b = new int[251];
		  int[] c = new int[251];
		  int j = 250;
		  for (int i = 0;i < 251;i++)
		  {
				  a[i] = 0;
				  b[i] = 0;
				  c[i] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  q = tempVar2.charAt(0);
		  }
		  for (int i = 0;i < p.length();i++)
		  {
			  a[i] = p.charAt(p.length() - 1 - i) - 48;
		  }
		  for (int i = 0;i < q.length();i++)
		  {
			  b[i] = q.charAt(q.length() - 1 - i) - 48;
		  }
		  for (int i = 0;i < 250;i++)
		  {
				  c[i] = a[i] + b[i] + c[i];
				  if (c[i] >= 10)
				  {
							 c[i] = c[i] - 10;
							 c[i + 1] = c[i + 1] + 1;
				  }
		  }
		  while (c[j] == 0 && j != 0)
		  {
		  j--;
		  }
		  if (j == 0 && c[j] == 0)
		  {
			  System.out.print("0\n");
		  }
		  else
		  {
			  for (int i = j;i >= 0;i--)
			  {
				  System.out.printf("%d",c[i]);
			  }
			  System.out.print("\n");
		  }

	}
}

