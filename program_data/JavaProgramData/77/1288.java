package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*		????        
	*/


	public static String b = new String(new char[100]);
	public static int[] a = new int[100];
	public static int i;
	public static int j;
	public static void peidui(int l)
	{
		int flag = 0;
		if (l == 0)
		{
			return;
		}
		for (i = 0; i < l - 1; i++)
		{
			if ((b.charAt(i) == b.charAt(0)) && (b.charAt(i + 1) != b.charAt(0))) //????????????????
			{
				System.out.print(a[i]);
				System.out.print(" ");
				System.out.print(a[i + 1]);
				System.out.print("\n");
				for (j = i; j < l - 2; j++)
				{
					a[j] = a[j + 2];
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 2));
				}
				break;
			}
		}
		peidui(l - 2);
	}
	public static int Main()
	{
		int l;
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = b.length();
		for (i = 0; i < l; i++)
		{
			a[i] = i;
		}
		peidui(l);
		return 0;
	}
}

