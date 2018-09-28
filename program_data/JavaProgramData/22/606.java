package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[] a = new int[301];
			int i;
			int k;
			int j;
			int l;
			int t;
			int s;
		String b = new String(new char[300]);
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
		}
		while (b.charAt(i) == ',')
		{
		  i++;
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar4 != null)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, tempVar4);
		  }
		} //?????i+1
		k = 0;
		while ((a[k] == a[k + 1]) && (k < i))
		{
		k++; //k=i??????
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
			 if (k == i)
			 {
				 System.out.print("No");
			 }
			 else
			 {
				for (j = 0;j < i;j++)
				{
				 for (l = 0;l < i - j;l++)
				 {
				   if (a[l] > a[l + 1])
				   {
						 t = a[l];
						 a[l] = a[l + 1];
						 a[l + 1] = t;
				   } //have been sorted
				 }
				}
				s = i;
				while (a[s] == a[s - 1])
				{
				s--;
				}
				System.out.printf("%d",a[s - 1]);


			 }
		}
		 return 0;
	}


}

