FROM yijun/fast:built
RUN apt install -y python3-pip
RUN pip3 install flatbuffers
RUN pip3 install tqdm
RUN cp -r /opt/* /usr/local/
ENTRYPOINT ["/usr/local/bin/ggnn"]
