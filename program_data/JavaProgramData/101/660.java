package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[3]; //a????????word??????
	 int[] word = new int[3];
	 String b = new String(new char[3]); //b???
	 for (int i = 0;i < 3;i++)
	 {
	   for (int j = 0;j < 3;j++) //??????
	   {
		  if (j == i)
		  {
			  continue; //????????
		  }
		  int k = 3 - i - j;
		  a[0] = i,a[1] = j,a[2] = k;
		  word[0] = (a[1] > a[0]) + (a[0] == a[2]); //??????
		  word[1] = (a[0] > a[1]) + (a[0] > a[2]);
		  word[2] = (a[2] > a[1]) + (a[1] > a[0]);
		  if (a[0] + word[0] == 2 && a[1] + word[1] == 2 && a[2] + word[2] == 2) //????
		  {
			   b = tangible.StringFunctions.changeCharacter(b, a[0], 'A');
			   b = tangible.StringFunctions.changeCharacter(b, a[1], 'B');
			   b = tangible.StringFunctions.changeCharacter(b, a[2], 'C');
			   System.out.print(b.charAt(0));
			   System.out.print(b.charAt(1));
			   System.out.print(b.charAt(2));
		  }
	   }
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}
}

