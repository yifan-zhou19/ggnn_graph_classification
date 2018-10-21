package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,2500 * (Character.SIZE / Byte.SIZE));
		int i = 0;
		int j = 0;
		int count = 0;
		char c = System.in.read();
		while ('\n' != c)
		{
			if (' ' == c)
			{
				i++;
				j = 0;
			}
			else
			{
				b.charAt(i)[j++] = c;
			}
			c = System.in.read();
		}
		//for(i=0;b[i-1][j-1]!='\n';i++)
		//{
		//	count++;
		//	for(j=0;(b[i][j-1]!=' ')&&(b[i][j-1]!='\n');j++)
		//	{
		//		b[i][j]=getchar();//????????????????????
		//	}
		//}
		count = i + 1;
		for (i = count - 1;i >= 1;i--)
		{
			for (j = 0;b.charAt(i)[j] != '\0';j++)
			{
				//if(b[i][j]=='\n')
				//{
				//	cout<<" ";break;
				//}
				//else
				//{
				System.out.print(b.charAt(i)[j]);
				//if(b[i][j]==' ')
				//{ break;}
				//}

			}
			System.out.print(" ");
		}
		for (j = 0;b.charAt(0)[j] != '\0';j++)
		{
			System.out.print(b.charAt(0)[j]);
		}


		return 0;
	}
}
