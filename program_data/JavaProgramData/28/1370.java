package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String a = new String(new char[3000]);
			a = new Scanner(System.in).nextLine();

			int len = a.length();
			int[] b = new int[300]; //???

			int temp = 0; //?????
			int num = 0;
			int i;

			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
				{

					b[num] = i - temp;
					num += 1;

				}
				if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
				{
					temp = i + 1;
				}
			}



			b[num] = len - temp;
			num++;

			//printf("%d %d\n",len,temp);

			for (i = 0;i < num;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d",b[i]);
				}
				if (i != 0)
				{
					System.out.printf(",%d",b[i]);
				}
			}

			return 0;
	}
}
