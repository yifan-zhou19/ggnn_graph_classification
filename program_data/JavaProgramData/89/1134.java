//********************************
//*?????????   **
//*?????? 1200012837 **
//*???2012.12.10  **
//********************************

public class k
{
	public int know;
	public int known;
}

package <missing>;

public class GlobalMembers
{
	public static k[] kk = tangible.Arrays.initializeWithDefaultkInstances(10010);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(kk,0,sizeof(k) * 10010);
		while (i != 0 || j != 0)
		{
			kk[i].know++;
			kk[j].known++;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (;i < n; i++)
		{
			if (kk[i].know == 0 && kk[i].known != 0)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

