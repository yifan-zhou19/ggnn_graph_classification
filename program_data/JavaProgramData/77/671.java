import java.util.*;

void lashou(char [],int,int);
int main()
{
	int i;
	int sum;
	String nn = new String(new char[101]);
	nn = new Scanner(System.in).nextLine();
	for (i = 1;nn.charAt(i) != '\0';i++)
	{
		if (nn.charAt(i) == nn.charAt(0))
		{
			continue;
		}
		else
		{
			sum = nn.charAt(0) + nn.charAt(i);
		}
	}
	i--;
	lashou(nn,i,sum);
	return 0;
}
void lashou(char shou[],int n,int sum)
{
	int i;
	int j;
	int k;
	int zhi;
	for (i = 0;i <= n;i++)
	{
		for (j = i;j <= n;j++)
		{
			if ((shou[i] + shou[j]) == sum)
			{
				zhi = 0;
				for (k = i + 1;k <= j - 1;k++)
				{
					if (shou[k] != 0)
					{
						zhi = 1;
					}
				}
				if (zhi == 0)
				{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				shou[i] = shou[j] = 0;
				lashou(shou,n,sum);
				break;
				}
			}
		}
	}
}
