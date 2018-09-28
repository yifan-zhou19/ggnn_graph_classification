package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????????????***
	//***??????***
	//***???2012.12.26***
	//*************************************************
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int flag;
		int f;
		String a = new String(new char[100]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\0',(Character.SIZE / Byte.SIZE));
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			j = 0;
			f = 0;
			do
			{
				flag = 1;
				k = 0;
				while (a.charAt(k) != '\0')
				{
					if (a.charAt(k) == a.charAt(j) && k != j)
					{
						flag = 0;
						break;
					}
					else
					{
						k++;
					}
				}
				if (flag == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					f = 1;
					break;
				}
				else
				{
					j++;
				}
			} while (a.charAt(j) != '\0');
			if (f == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

