package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[501]);
		char[][] word = new char[501][7];
		char ctemp;
		int num;
		int i;
		int j;
		int length;
		int k;
		int[] jishu = new int[501];
		int temp;
		int m;
		int count;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 501;i++)
		{
			input = tangible.StringFunctions.changeCharacter(input, i, '\0');
		}
		for (i = 0;i < 501;i++)
		{
			jishu[i] = 1;
		}
		for (i = 0;i < 501;i++)
		{
			 for (j = 0;j < 7;j++)
			 {
				 word[i][j] = '\0';
			 }
		}
		System.in.read();
		cin.get(input,501);
		length = input.length();
		k = -1;
		for (i = 0;i < length - num + 1;i = i - num + 1)
		{
							 k++;
							 for (j = 0;j < num;j++)
							 {
												word[k][j] = input.charAt(i);
												i++;
							 }
		}
		for (i = 0;i < k + 1;i++)
		{
						  for (j = i + 1;j < k + 1;j++)
						  {
										  count = 0;
										  for (m = 0;m < num;m++)
										  {
															if (word[i][m] != word[j][m])
															{
																break;
															}
															else
															{
																count++;
															}
										  }
										  if (count == num)
										  {
											  jishu[i]++;
										  }
						  }
		}
	   // for(i=0;i<k+1;i++) cout<<word[i]<<" "<<jishu[i]<<endl;
		for (i = 0;i < k;i++)
		{
						for (j = 0;j < k - i;j++)
						{
										  if (jishu[j] < jishu[j + 1])
										  {
																  temp = jishu[j];
																  jishu[j] = jishu[j + 1];
																  jishu[j + 1] = temp;
																  for (int m = 0;m < num;m++)
																  {
																		  ctemp = word[j][m];
																		  word[j][m] = word[j + 1][m];
																		  word[j + 1][m] = ctemp;
																  }
										  }
						}
		}
		//for(i=0;i<k+1;i++) cout<<jishu[i]<<endl;
		if (jishu[0] > 1)
		{
						System.out.print(jishu[0]);
						System.out.print("\n");
						for (i = 0;i < k + 1;i++)
						{
										  if (jishu[i] == jishu[0])
										  {
											  System.out.print(word[i]);
											  System.out.print("\n");
										  }
										  else
										  {
											  break;
										  }
						}
		}
		else
		{
			System.out.print("NO");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

