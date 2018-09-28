package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int m = 0;
		int[] a = new int[4];
		char n;
		String b = new String(new char[4]);
		b = tangible.StringFunctions.changeCharacter(b, 0, 'z');
		b = tangible.StringFunctions.changeCharacter(b, 1, 'q');
		b = tangible.StringFunctions.changeCharacter(b, 2, 's');
		b = tangible.StringFunctions.changeCharacter(b, 3, 'l');
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0,(Integer.SIZE / Byte.SIZE));
		for (int A = 1;A < 6;A++)
		{
		  for (int B = 1;B < 6;B++)
		  {
			 for (int C = 1;C < 6;C++)
			 {
				for (int D = 1;D < 6;D++)
				{
				   if ((C != A) && (C != B) && (A != B) && (D != A) && (D != B) && (D != C))
				   {
					 sum = ((A + B) == (C + D)) + ((A + D) > (B + C)) + ((A + C) < B);
					 if (sum == 3)
					 {
					   a[0] = 10 * A;
					   a[1] = 10 * B;
					   a[2] = 10 * C;
					   a[3] = 10 * D;
					   for (int j = 1;j <= 3;j++)
					   {
						 for (int i = 0;i <= 3 - j;i++)
						 {
						   if (a[i] < a[i + 1])
						   {
							 m = a[i];
							 a[i] = a[i + 1];
							 a[i + 1] = m;
							 n = b.charAt(i);
							 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
							 b = tangible.StringFunctions.changeCharacter(b, i + 1, n);
						   }
						 }
					   }
					   System.out.print(b.charAt(0));
					   System.out.print(" ");
					   System.out.print(a[0]);
					   System.out.print("\n");
					   System.out.print(b.charAt(1));
					   System.out.print(" ");
					   System.out.print(a[1]);
					   System.out.print("\n");
					   System.out.print(b.charAt(2));
					   System.out.print(" ");
					   System.out.print(a[2]);
					   System.out.print("\n");
					   System.out.print(b.charAt(3));
					   System.out.print(" ");
					   System.out.print(a[3]);
					   System.out.print("\n");
					 }
				   }
				}
			 }
		  }
		}
		return 0;
	}
}

