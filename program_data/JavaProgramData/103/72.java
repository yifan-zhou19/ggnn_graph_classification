package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int l;
		String shuru = new String(new char[2000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shuru = tempVar.charAt(0);
		}
	   i = shuru.length();
	   k = 0;
	   l = 0;

	   for (j = 0;j < i;j++)
	   {
		   if (shuru.charAt(j) > 90)
		   {
		   shuru = tangible.StringFunctions.changeCharacter(shuru, j, shuru.charAt(j) - 32);
		   }
		   else
		   {
			   ;
		   }
	   }
	   if (i == 1)
	   {
		   System.out.printf("(%c,1)",shuru.charAt(k));
	   }
	   else
	   {

	   while (k < i - 1)
	   {

			if (shuru.charAt(k) == shuru.charAt(k + 1))
			{
									s = 1;
					do
					{
					 s++;

					} while (shuru.charAt(k) == shuru.charAt(k + s));
					System.out.printf("(%c,%d)",shuru.charAt(k),s);

					k = k + s;
			}
			else
			{
				System.out.printf("(%c,1)",shuru.charAt(k));
				k++;
				l++;
			}
		   // printf("%d",k);

			if (k == i - 1)
			{
			System.out.printf("(%c,1)",shuru.charAt(k));
			}
			else
			{
				;
			}


	   }
	   }

		System.in.read();
		System.in.read();
	}



}

