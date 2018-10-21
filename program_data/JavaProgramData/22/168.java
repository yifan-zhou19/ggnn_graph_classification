package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int j = 0;
		 int k;
		 int temp;
		 int[] b = new int[300];
		 String ss = new String(new char[1500]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 ss = tempVar.charAt(0);
		 }
		 for (i = 0;i < 300;i++)
		 {
			 b[i] = 0;
		 }

		 for (i = 0;i < 1500;i++)
		 {
			 if (ss.charAt(i) > 47 && ss.charAt(i) < 58)
			 {
				 b[j] = b[j] * 10 + ss.charAt(i) - 48;
			 }
			 else if (ss.charAt(i) == 0)
			 {
				 break;
			 }
			 else
			 {
				 j++;
			 }
		 }


		 for (i = 0;i < j;i++)
		 {
			for (k = 0;k < j - i;k++)
			{
				if (b[k] < b[k + 1])
				{
					temp = b[k];
					b[k] = b[k + 1];
					b[k + 1] = temp;
				}
			}
		 }


			if (j == 0)
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = 0;i < j + 1;i++)
				{
					if (b[i] != b[i + 1])
					{
						if ((i + 1) != (j + 1))
						{
							System.out.printf("%d",b[i + 1]);
							break;
							temp = -1;
						}
						else
						{
							System.out.print("No");
						}
					}


				}
			}


	}
}

