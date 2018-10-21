package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		k = a.length();
		for (i = 0;i < k;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (k == 1)
		{
		System.out.printf("0\n%d",b[0]);
		}
		else
		{
			if (k == 2 && b[0] * 10 + b[1] < 13)
			{
				m = b[0] * 10 + b[1];
				System.out.print("0\n");
				System.out.printf("%d",m);
			}
			 else
			 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				  memset(d,0,100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				  memset(c,0,100 * (Integer.SIZE / Byte.SIZE));
				  for (i = 0;i < k;i++)
				  {
					  d[i] += b[i];
					  if (d[i] >= 13)
					  {
						  c[i] = d[i] / 13;
						  d[i + 1] = (d[i] % 13) * 10;
					  }
					  else
					  {
						  c[i] = 0;
						  d[i + 1] = d[i] * 10;
					  }
				  }
				  m = d[k] / 10;
				  if (c[1] == 0)
				  {
					  for (i = 2;i < k;i++)
					  {
						  System.out.printf("%d",c[i]);
					  }
						  System.out.print("\n");
						  System.out.printf("%d",m);

				  }
				  else
				  {
					  for (i = 1;i < k;i++)
					  {
						  System.out.printf("%d",c[i]);
					  }
						  System.out.print("\n");
						  System.out.printf("%d",m);

				  }


			 }

		}




	}
}

