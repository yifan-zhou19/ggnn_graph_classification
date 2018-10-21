package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	/* ? ? ?   ???????
	/* ? ?      ????                           
	/* ? ? ? ??2010 ? 11  ? 7   ?     
	/* ? ? ? ??????????
	/* ? ?      ?1000012752        
	*******************************************************/ 
	public static int Main()
	{
		int n;
		int k;
		int[] a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		for (k = 0 ; k < n ; k++)
		{
			 a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		int i;
		int j;
		int temp;
		for (i = 0 ; i < n - 1 ; i++) //???n-1?
		{
			for (j = 0 ; j < n - 1 - i ; j++) //????????????????????
			{
				  if (a[j] > a[j + 1]) //????a[j],a[j+1]???????????
				  {
					  temp = a[j];
					  a[j] = a[j + 1];
					  a[j + 1] = temp;
				  }
			}
		}
		int t = 0;
		for (i = 0 ; i < n ; i++)
		{
			if (a[i] % 2 == 0)
			{
			continue;
			}
			if (t != 0)
			{
			System.out.print(",");
			}
			System.out.print(a[i]);
			t = 1;
		}
		return 0;
	}
}

