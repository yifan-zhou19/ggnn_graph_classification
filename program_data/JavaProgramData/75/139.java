package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] arrival = new int[1000];
		int[] depature = new int[1000];
		int i = 0;
		int j;
		int count;
		int max = 0;
		int t = 0;
		String a = new String(new char[2000]);
		while (true)
		{
			arrival[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//cout<<arrival[i]<<' ';
			i++;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		//cout<<endl;
		int total = i;
		i = 0;
		while (true)
		{
			depature[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//cout<<depature[i]<<' ';
			i++;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		//cout<<endl;
		for (i = 0;i < 1000;i++)
		{
			count = 0;
			for (j = 0;j < total;j++)
			{
				if (i >= arrival[j] != 0 && i < depature[j])
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
				//cout<<"max="<<max<<' '<<"i="<<i<<endl;
			}
		}
		System.out.print(total);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}



	/*
	cin.getline(a,2000);
		while(true)
		{
			char temp[20],time=0;
			memset(temp,0,sizeof(temp));
			for(;a[i]==',';i++)
			{
				if(a[i]=='\n')
				{
					letsBreak=true;
					arrival[t]=atof(temp);
					break;
				}
				temp[time]=a[i];
			}
			if(letsBreak)
				break;
			arrival[t]=atof(temp);
			i++;
			t++;
		}
		i=0,t=0;
		memset(a,0,sizeof(a));
		cin.getline(a,2000);
		while(true)
		{
			char temp[20],time=0;
			memset(temp,0,sizeof(temp));
			for(;a[i]==',';i++)
			{
				if(a[i]=='\n')
				{
					letsBreak=true;
					depature[t]=atof(temp);
					break;
				}
				temp[time]=a[i];
			}
			if(letsBreak)
				break;
			depature[t]=atof(temp);
			t++;
		}
		int total=t+1;
	*/

}

