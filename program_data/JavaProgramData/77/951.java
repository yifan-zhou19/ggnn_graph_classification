package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????.cpp                     **
	//*??: ??     1100012808              **
	//*???2011.11.22                       **
	//******************************************
	public static void zifu(String a) //??????????????
	{
		int i;
		int j;
		for (i = 1; i < a.length(); i++)
		{
			if (!a[i].equals(a[0])) //????????????
			{
				for (j = i - 1; !a[j].equals(a[0]); j--)
				{
					a[j] = a[i]; //?????????????
				}
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				a[j] = a[i]; //?????????????
			}
		}
		return;
	}


	public static int Main() //???
	{ //?????
		String a = new String(new char[10000]);
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		zifu(a);
		return 0;
	} //?????
}

